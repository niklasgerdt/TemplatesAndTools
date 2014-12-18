package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestService {
//	<!-- CDI Does not work as listener, when using Jersey -->
//	@Inject
	private Query query = new QueryImpl();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		System.out.println("rest-get");
		return query.query();
	}
}
