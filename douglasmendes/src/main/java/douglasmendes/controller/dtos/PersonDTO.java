package douglasmendes.controller.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import douglasmendes.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    @NotEmpty(message = "Name is mandatory")
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    public Person ToPerson(){
        return  new Person(name, birthDate);
    }
}
