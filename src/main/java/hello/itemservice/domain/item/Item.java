package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10000원 이상")
// ↑ObjectError사용방법1(비추천, 그냥 컨트롤러에서 자바코드로 해라)
public class Item {

//    @NotNull(groups = UpdateCheck.class)
    private Long id;

//    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class}, message = "공백X")//error.properties에 정의된게 없으면 공백X 출력함, 공백X도 안적으면 공백일 수 없습니다 라는 디폴트메시지 출력함
    private String itemName;

//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min=1000, max = 1000000, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = SaveCheck.class)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
