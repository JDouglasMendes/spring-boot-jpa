package douglasmendes.domain;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@ToString
@Getter()
@Setter(AccessLevel.PRIVATE)
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @Column
    private String name;
    @NonNull
    @Column
    private LocalDate birthDate;
}
