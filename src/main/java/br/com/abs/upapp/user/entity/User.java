package br.com.abs.upapp.user.entity;


import br.com.abs.upapp.portfolio.dto.OwnerDto;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable  = false)
    private String name;
    @Column(unique = true)
    private String email;
    @Column(length = 20)
    private String profile;
    @Column(length = 50)
    private String document;


    public User(UserDto userDto) {
        this.id = userDto.getId();
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.profile = userDto.getProfile();
        this.document = userDto.getDocument();
    }

    public User(OwnerDto owner)  {
        this.id = owner.getId();
    }
}
