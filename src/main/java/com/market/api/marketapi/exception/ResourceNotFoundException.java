package com.market.api.marketapi.exception;

/**
 * Custom exception class for representing resource not found scenarios.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Constructs a new ResourceNotFoundException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
