package com.filipe.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * O código foi desenvolvido a partir do artigo disponível em https://blog.algaworks.com/tutorial-jpa/
 * */

public class Main {
	
	public static void main(String[] args) {
		/*
		 * "Clientes-PU" é o nome da unidade de persistência definida no arquivo src/teste/resources/META-INF/Persistence.xml
		 * */
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		/*Busca de registros. O registro de id 1 deve ter sido previamente inserido no banco de dados.
		 * Obs: No trecho abaixo o entityManager consegue identificar que as consultas se tratam do mesmo objeto, logo
		 * ele fará apenas uma consulta no banco de dados e usará o cache em mémoria para as oturas chamadas, não sendo
		 * necessário uma nova ida ao BD.
		 * */
		Cliente cli = entityManager.find(Cliente.class, 1);
		cli = entityManager.find(Cliente.class, 1);
		cli = entityManager.find(Cliente.class, 1);
		
		System.out.println("####"+cli.getNome() + "-" +cli.getId());
		
		/*
		 * Qualquer operação que faça alteração na base  (update, delete, insert) deve ser feita dentro de uma transação.
		 * begin() abre a transação e commit() fecha
		 * */
		//### inicio trasanção ###
		entityManager.getTransaction().begin();
		System.out.println("+++ Inserindo novo Registro +++ ");
		entityManager.persist(new Cliente("Supermercados Formosa"));
		
		System.out.println("+++ Inserindo novo Registro +++ ");
		entityManager.persist(new Cliente("Casa pequeno e grande"));
		
		entityManager.getTransaction().commit();
		//### fim ###
		
		//### inicio trasanção ###
		entityManager.getTransaction().begin();
	
		cli = entityManager.find(Cliente.class, 5);
		entityManager.remove(cli);
		
		entityManager.getTransaction().commit();
		//### fim ###
		
		entityManager.close();
		factory.close();
		
	}
}
