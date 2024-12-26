package com.example.jakarta.restful.bootstrap.rs;

import java.util.Collection;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/people")
public class PeopleRestService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Person> getPeople() {
        return List.of(new Person("a@b.com", "John", "Smith"));
    }
}