package com.innominds.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innominds.persistence.model.OrderProxy;
import com.innominds.persistence.model.User;
import com.innominds.service.proxy.OrderServiceProxy;

@RestController
@RequestMapping( value = "/users" )
public class UserResource {

    @Autowired
    OrderServiceProxy orderServiceProxy;

    @RequestMapping( method = RequestMethod.GET )
    public List<User> getUsers() {
        return Arrays.asList( new User( "tvajjala" ), new User( "rbert" ), new User( "john" ) );
    }

    @RequestMapping( value = "/orders", method = RequestMethod.GET )
    public List<OrderProxy> getOrders() {
        return orderServiceProxy.getOrders();
    }
}
