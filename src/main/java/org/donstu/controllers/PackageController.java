package org.donstu.controllers;

import org.donstu.domain.Package;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/package")
public class PackageController {
    private static List<Package> packages = new ArrayList<>();
    static {
        packages.add(new Package("Night", new Date(), 240, "Сommon"));
        packages.add(new Package("Daytime", new Date(), 360, "VIP"));
        packages.add(new Package("Full", new Date(), 600, "VIP"));
    }

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Response defaultPath() {
        return getPackage();
    }

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getPackage() {
        GenericEntity<List<Package>> genericEntity = new GenericEntity<List<Package>>(packages) {};
        return Response.ok(genericEntity).build();
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getPackage(@PathParam("id") String id) {
        int num = Integer.parseInt(id);
        if (packages.size() <= num) {
            return Response.ok().build();
        } else {
            return Response.ok(packages.get(num)).build();
        }
    }
}
