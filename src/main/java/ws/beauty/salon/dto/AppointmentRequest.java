package ws.beauty.salon.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class AppointmentRequest {
    private Integer id;
    private LocalDateTime appointmentDateTime;
    @NotBlank
    private String status;
    private Integer clientId;
    private Integer stylistId;
    private Integer serviceId;

    
}
