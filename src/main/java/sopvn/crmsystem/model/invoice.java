package sopvn.crmsystem.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "invoice")
@EntityListeners(AuditingEntityListener.class)
public class invoice {
	private int invoice_id;
	private int orderId;
	private Date invoiceDate;
	
	private order order;
	private List<cases> cases;
	private List<servicecalendar> servicecalendar;
	
	//join cases
	@OneToMany(mappedBy="invoice")
	public List<cases> getCases() {
		return cases;
	}

	public void setCases(List<cases> cases) {
		this.cases = cases;
	}
	//join servicecalendar
	@OneToMany(mappedBy="invoice")
	public List<servicecalendar> getServicecalendar() {
		return servicecalendar;
	}

	public void setServicecalendar(List<servicecalendar> servicecalendar) {
		this.servicecalendar = servicecalendar;
	}

	//join order
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public order getOrder() {
		return order;
	}

	public void setOrder(order order) {
		this.order = order;
	}

	@Column(name = "invoice_date", nullable = true)
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}


	@Column(name = "order_id", nullable = true)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int id) {
		this.invoice_id = id;
	}

}
