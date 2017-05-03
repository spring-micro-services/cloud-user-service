package com.innominds.service.proxy;

//@formatter:off
/**
 *
 * user-service.properties
 *
 * order-service-proxy.ribbon.listOfServices=order-service-host:port, order-service-host2:port
 *
 */
//@formatter:on
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.innominds.persistence.model.OrderProxy;
// @FeignClient(name="order-service-proxy")
// @RibbonClient(name="orders")

@FeignClient( name = "order-service-proxy", url = "localhost:8091" )
public interface OrderServiceProxy {

    // @RequestMapping( method = RequestMethod.GET )
    @RequestMapping( value = "/orders", method = RequestMethod.GET )
    List<OrderProxy> getOrders();
}
