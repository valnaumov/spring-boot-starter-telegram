package com.github.kshashov.telegram.handler.processor;

import javax.validation.constraints.NotNull;

/**
 * Dispatcher which is used to finds the handler for the current telegram request and invokes it.
 */
public interface RequestDispatcher {

    /**
     * Finds the {@code HandlerMethod} request handler and invokes it.
     *
     * @param event Telegram event
     * @return invocation result
     * @throws IllegalStateException when it failed to execute the handler method correctly
     */
    TelegramCallback execute(@NotNull TelegramEvent event) throws IllegalStateException;
}
