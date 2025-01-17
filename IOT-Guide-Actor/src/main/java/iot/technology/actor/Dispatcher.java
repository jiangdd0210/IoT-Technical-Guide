package iot.technology.actor;

import lombok.Data;

import java.util.concurrent.ExecutorService;

/**
 * @author mushuwei
 */
@Data
public class Dispatcher {

    private final String dispatcherId;
    private final ExecutorService executor;
}
