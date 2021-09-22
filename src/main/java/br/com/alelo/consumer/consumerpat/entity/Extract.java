package br.com.alelo.consumer.consumerpat.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class Extract {

    @Id
    int id;
    int establishmentNameId;
    String establishmentName;
    String productDescription;
    Date dateBuy;
    int cardNumber;
    double value;


    public Extract(int id, int establishmentNameId, String establishmentName, String productDescription, Date dateBuy, int cardNumber, double value) {

        this(establishmentNameId,establishmentName,productDescription,dateBuy,cardNumber,value);
        this.id = id;
    }

    public Extract( String productDescription, Date dateBuy, int cardNumber, double value) {
        this.productDescription = productDescription;
        this.dateBuy = dateBuy;
        this.cardNumber = cardNumber;
        this.value = value;
    }

    public Extract(int establishmentNameId,String establishmentName, String productDescription, Date dateBuy, int cardNumber, double value) {
        this(productDescription,dateBuy,cardNumber,value);
        this.establishmentNameId = establishmentNameId;
        this.establishmentName = establishmentName;
    }
}
