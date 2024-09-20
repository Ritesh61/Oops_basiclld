package zomato.api.data;

import java.time.LocalDateTime;

public class BusinessHours {

    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public BusinessHours(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
