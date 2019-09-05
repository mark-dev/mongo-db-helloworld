package ru.ts.example.mongodb;

import com.mongodb.DBObject;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Map;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    //https://stackoverflow.com/questions/46466562/how-to-save-and-query-dynamic-fields-in-spring-data-mongodb
    private Map<String,Object> otherProps;

    public Customer(String firstName, String lastName,Map<String,Object> otherProps) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherProps = otherProps;
    }
}
