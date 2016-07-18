/**@author Umesh Kumar Toke
 * Problem Statement: Crud Operations using EclipseLink
 * Role of this File: Class that returns Singleton Entity Manager Object  
 */
package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EclipseLinkUtils 
{
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EclipseLinkUtils elu = new EclipseLinkUtils();
	//Intializes Enitity Manager Factory and Entity Manager
	private EclipseLinkUtils() 
	{
		emf = Persistence.createEntityManagerFactory("EclipseLinkCRUD");
		em = emf.createEntityManager();
	}
	//Return Entity Manager
	public static EntityManager getEM()
	{
		return elu.em;
	}
	
}
