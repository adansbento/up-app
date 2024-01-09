package br.com.abs.upapp.user.dto;


import br.com.abs.upapp.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

        private Long id;
        private String name;
        private String email;
        private String profile;
        private String document;

        public UserDto(User user) {
                this.id = user.getId();
                this.name = user.getName();
                this.email = user.getEmail();
                this.profile = user.getProfile();
                this.document = user.getDocument();
        }
}


