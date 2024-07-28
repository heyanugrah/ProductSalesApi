
package com.market.api.marketapi.utilities;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Utility class for database-related operations.
 * Provides methods to handle common database utilities.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
public class DatabaseUtility {

    /**
     * Utility method to update fields if they are present.
     * Executes the provided setter function if the value is not null.
     *
     * @param value The value to check and potentially set
     * @param setter The setter function to execute if the value is present
     * @param <T> The type of the value
     */
    public <T> void updateIfPresent(T value, Consumer<T> setter) {
        Optional.ofNullable(value).ifPresent(setter);
    }

}
