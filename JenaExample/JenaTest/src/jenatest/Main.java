/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jenatest;

import java.io.FileNotFoundException;
import java.util.Vector;



/**
 *
 * @author Ignasi Gómez-Sebastià
 */
public class Main {



    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException
    {
        
        String JENA = "./";
        String File = "PizzaPatatitas.owl";
        String NamingContext = "http://www.co-ode.org/ontologies/pizza/pizza.owl";
        
        System.out.println("----------------Starting program -------------");

        JenaTester tester = new JenaTester(JENA,File,NamingContext);

        tester.loadOntology();        

        //tester.getClasses();

        //tester.getIndividuals();

        //tester.getIndividualsByClass();

        //tester.getPropertiesByClass();       

        System.out.println("Run a test Data property");
        tester.runSparqlQueryDataProperty();

        System.out.println("Run a test Object property");
        tester.runSparqlQueryObjectProperty();

        System.out.println("Run and modify");
        //tester.runSparqlQueryModify();

        System.out.println("Re-Run to check modification");
        //tester.runSparqlQueryModify();

        
        
        tester.releaseOntology();
        
        System.out.println("--------- Program terminated --------------------");
     
    }

}
