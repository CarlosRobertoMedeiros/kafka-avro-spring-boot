package br.com.roberto.pockafkaproducer.exception;

public class BandRequestException extends RuntimeException {
    public BandRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
