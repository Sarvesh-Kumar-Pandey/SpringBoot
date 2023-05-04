package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendor {
	@Id
	private Integer venId;
	private String venName;
	private String venAddr;
	private String venCode;
	

}
