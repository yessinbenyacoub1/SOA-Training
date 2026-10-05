package webservices;
import metiers.UniteEnseignementBusiness;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/ue/list")
public class UniteEnsRestAPI {
    //helper instance that will help to manipulate data
    // to manipulate data : CRUD
    UniteEnseignementBusiness helper =
            new UniteEnseignementBusiness();
    //get List UEs
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getListUEs(){
        return Response
                .status(200)
                .entity(helper.getListeUE())
                .build();
    }
}
