package br.com.abs.upapp.user.entity;


import br.com.abs.upapp.user.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user-app")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(length = 50)
    private String profile;
    @Column(length = 50)
    private String document;



    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.profile = userDto.getProfile();
        this.document = userDto.getDocument();
    }
}
