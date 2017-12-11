package dev.sql_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		/* Cette ligne exécute un bloc static dans la classe Driver qui effectue ceci:
		 * DriverManager.registerDriver(new org.mariadb.jdbc.Driver();
		*/ 
		Class.forName("org.mariadb.jdbc.Driver");
		
		/* Connexion à la base */
//		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bricolage", "root", "");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://b31fqelce-mysql.services.clever-cloud.com:3306/b31fqelce", "upr287ckdflasr5x", "34SIXDkLW37FxVVUXEz");
		Statement stat = conn.createStatement();

		// TODO Générer 100 fournisseurs
//		for (int i = 4; i < 101; i++) {
//			String nom = "F0" + i;
//			String query = "INSERT into fournisseur (ID,NOM) VALUES (" + i + "," + "\"" + nom + "\");";
//			System.out.println(query);
//			stat.executeQuery(query);
//		}
		
		// TODO Générer 1 000 000 d'articles. Chaque article est associé à l'un des 100 fournisseurs
//		conn.setAutoCommit(false);
//		for(int i = 11; i < 1000001;i++) {
//			String ref = "REF_"+i;
//			String designation = "DESC_" + i;
//			double lower = 10.0;
//			double higher = 150.0;
//
//			double random = (double)(Math.random() * (higher-lower)) + lower;
//			double p = (double) Math.pow(10, 2);
//	        double value = random * p;
//	        double tmp = Math.round(value);
//			double prix = tmp / p;
//			int min = 1;
//			int max = 100;
//			int id_fou = min + (int)(Math.random() * max);
//			String query = "INSERT into article (ID,REF,DESIGNATION,PRIX,ID_FOU) VALUES (" + i + "," + "\"" + ref + "\"," + "\"" + 
//					designation + "\","  + prix + "," + "" + id_fou +");";
//			System.out.println(query);
//			
//			stat.executeUpdate(query);
//			if(i%1000 == 0) {
//				conn.commit();
//			}
//		}
//		conn.commit();
//		
		// TODO Select avec et sans indexe
//		long start = System.currentTimeMillis();
//		
////		String query = "SELECT * FROM article, fournisseur WHERE article.ID_FOU=fournisseur.ID AND fournisseur.ID IN (25)";
//		String query = "SELECT * FROM article WHERE REF LIKE 'REF_2%'";
//		stat.executeQuery(query);
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("Temps d'exécution = " + (end-start) + "ms");
//		

		
		
		stat.close();
		conn.close();

	}
}
