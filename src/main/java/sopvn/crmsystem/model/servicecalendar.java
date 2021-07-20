package sopvn.crmsystem.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "servicecalendar")
@EntityListeners(AuditingEntityListener.class)
public class servicecalendar {
	private int servicecalendar_id;
	private int userId;
	private String serviceName;
	private String serviceDetail;
	private int invoiceId;
	private Date assignedDate;
	
	private invoice invoice;
	
	//join invoice
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(invoice invoice) {
		this.invoice = invoice;
	}

	@Column(name = "assigned_date", nullable = true)
	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}


	@Column(name = "invoice_id", nullable = true)
	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}


	@Column(name = "service_detail", nullable = true)
	public String getServiceDetail() {
		return serviceDetail;
	}

	public void setServiceDetail(String serviceDetail) {
		this.serviceDetail = serviceDetail;
	}


	@Column(name = "service_name", nullable = true)
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	@Column(name = "user_id", nullable = true)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getServicecalendar_id() {
		return servicecalendar_id;
	}

	public void setServicecalendar_id(int id) {
		this.servicecalendar_id = id;
	}

}

