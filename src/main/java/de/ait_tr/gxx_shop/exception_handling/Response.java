package de.ait_tr.gxx_shop.exception_handling;
/*
@date 22.07.2024
@author Sergey Bugaienko
*/

import java.util.Objects;

public class Response {
    private String message;

    public Response(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response: message - " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response response = (Response) o;
        return Objects.equals(message, response.message);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(message);
    }
}