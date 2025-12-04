package ws.beauty.salon.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AppointmentResponse {
    @JsonProperty("id appointment")
    Integer idAppointment;
    @JsonProperty("appointment datetime")
    LocalDateTime appointmentDatetime;
    @JsonProperty("status")
    String status;
    @JsonProperty("id client")
    Integer idClient;
    @JsonProperty("id stylist")
    Integer idStylist;
    @JsonProperty("id service")
    Integer idService;
}