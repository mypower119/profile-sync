package com.vng.datasync.event;

/**
 * @author thuannv
 * @since 17/07/2017
 */
public interface EventListener {
    void onEvent(int id, Object... args);
}
