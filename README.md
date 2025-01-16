Package Declaration: com.atuluttam defines the namespace for the code.
Imports: Required classes and packages are imported:
Product: Represents the entity to be persisted in the database.
EntityManager and EntityManagerFactory: JPA classes to manage persistence context and database connections.
Persistence: Utility class to create EntityManagerFactory.
HibernatePersistenceProvider: Hibernate is used as the JPA provider.



EntityManagerFactory (emf): A heavyweight object that creates EntityManager. 
It uses the configuration specified in the persistence.xml file (identified by my-persistence-unit).

EntityManager (em): Lightweight object that represents the persistence context, allowing interaction with the database.




Transaction Management:
em.getTransaction().begin(): Begins a transaction to make changes to the database.
em.getTransaction().commit(): Commits the transaction, making changes permanent in the database.

Entity Creation:
Product p = new Product(): Creates a new Product instance.
p.setId(2L): Sets the ID of the Product. It's assumed that the ID is mapped as the primary key in the Product entity class.
p.setName("Laptop"): Sets the name property of the Product.

Persisting the Entity:
em.persist(p): Marks the Product entity as managed, making it eligible for persistence in the database.


Closing EntityManager:
Ensures that resources are released after the transaction completes.
