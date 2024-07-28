package com.market.api.marketapi.exception;

/**
 * Custom exception class for representing bad request scenarios.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
public class BadRequestException extends RuntimeException {

    /**
     * Constructs a new BadRequestException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
    public BadRequestException(String message) {
        super(message);
    }
}
