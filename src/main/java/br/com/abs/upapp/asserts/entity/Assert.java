package br.com.abs.upapp.asserts.entity;

import br.com.abs.upapp.asserts.dto.AssertDto;
import br.com.abs.upapp.portfolio.entity.TypeAssert;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Column(unique = true,nullable = false)
    private String assertCode;
    @Column(length = 50)
    private String document;
    @Column(nullable = false)
    private BigDecimal value;
    @Column(nullable = false)
    private TypeAssert typeAssert;

    public Assert(AssertDto assertDto) {
        this.id = assertDto.getId();
        this.description = assertDto.getDescription();
        this.assertCode = assertDto.getAssertCode();
        this.document = assertDto.getDocument();
        this.value = assertDto.getValue();
        this.typeAssert = assertDto.getTypeAssert();
    }
}
