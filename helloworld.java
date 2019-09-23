/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Adhi Baskoro
 */
@Path("greeting")
public class helloworld {

    /**
     * Creates a new instance of helloworld
     */
    public helloworld() {
    }
    
    @EJB
    private NameStorageBean nameStorage;

    /**
     * Get the value of nameStorage
     *
     * @return the value of nameStorage
     */
    public NameStorageBean getNameStorage() {
        return nameStorage;
    }

    /**
     * Set the value of nameStorage
     *
     * @param nameStorage new value of nameStorage
     */
    public void setNameStorage(NameStorageBean nameStorage) {
        this.nameStorage = nameStorage;
    }

    @Context
    private UriInfo context;
    
    /**
     * Retrieves representation of an instance of helloworld.helloworld
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        //TODO return proper representation object
        return "<html>"
                + "<body>"
                + "<h1>Hello "+nameStorage.getName()+"!</h1>"
                + "<h1>Welcome to FIT5042 Week08 Exercise!</h1>"
                + "</body>"
                + "</html>";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of helloworld
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
    
    /**
    * POST method for updating an instance of HelloWorldResource
    * @param content representation for the resource
    *
    */
    @POST
    @Consumes("application/x-www-form-urlencoded")
    public void setPostName(@FormParam("name") String content) {
        nameStorage.setName(content);
        //return "<html><body><h1>Hello "+nameStorage.getName()+"!</h1></body></html>";
    }
 
}


        
    

