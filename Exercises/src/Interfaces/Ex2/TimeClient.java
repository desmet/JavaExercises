package Interfaces.Ex2;

import java.time.LocalDateTime;

/**
 * Suppose you have written a time server that periodically notifies its clients of the
 * current date and time. Write an interface the server could use to enforce a particular
 * protocol on its clients.
 */

public interface TimeClient {
    void setDate(int day, int month, int year);
    void setTime(int hour, int minute, int second);
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
