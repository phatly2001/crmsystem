package sopvn.crmsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "resource")
@EntityListeners(AuditingEntityListener.class)
public class resource {
	private int resource_id;
	private String resourceName;
	private int resourceQuantity;
	private String resourceDetail;
	private boolean resourceStatus;
	

	@Column(name = "resource_status", nullable = true)
	public boolean getResourceStatus() {
		return resourceStatus;
	}

	public void setResourceStatus(boolean resourceStatus) {
		this.resourceStatus = resourceStatus;
	}


	@Column(name = "resource_detail", nullable = true)
	public String getResourceDetail() {
		return resourceDetail;
	}

	public void setResourceDetail(String resourceDetail) {
		this.resourceDetail = resourceDetail;
	}


	@Column(name = "resource_quantity", nullable = true)
	public int getResourceQuantity() {
		return resourceQuantity;
	}

	public void setResourceQuantity(int resourceQuantity) {
		this.resourceQuantity = resourceQuantity;
	}


	@Column(name = "resource_name", nullable = true)
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getResource_id() {
		return resource_id;
	}

	public void setResource_id(int id) {
		this.resource_id = id;
	}

}

