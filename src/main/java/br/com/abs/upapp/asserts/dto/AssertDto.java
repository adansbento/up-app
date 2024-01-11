package br.com.abs.upapp.asserts.dto;

import br.com.abs.upapp.asserts.entity.Assert;
import br.com.abs.upapp.portfolio.entity.TypeAssert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssertDto {

    private Long id;
    private String description;
    private String assertCode;
    private String document;
    private BigDecimal value;
    private TypeAssert typeAssert;

    public AssertDto(Assert anAssert) {
        this.id = anAssert.getId();
        this.description = anAssert.getDescription();
        this.assertCode = anAssert.getAssertCode();
        this.document = anAssert.getDocument();
        this.value = anAssert.getValue();
        this.typeAssert = anAssert.getTypeAssert();
    }
}
