package org.mchat.io.chatServer.router;

import java.io.Serializable;

/**
 * Created by jingli on 16/6/22.
 */
public interface Routable<T> {

    public T getFrom();
    public T getto();


}
