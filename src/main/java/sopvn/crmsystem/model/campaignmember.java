package sopvn.crmsystem.model;

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
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "campaignmember")
@EntityListeners(AuditingEntityListener.class)
public class campaignmember {
	private int campaignmember_id;
	private int campaignId;
	private int leadId;
	private int contactId;
	
	private lead lead;
	private contact contact;
	private campaign campaign;
	
	//join campaign 
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "campaign_id", referencedColumnName = "campaign_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(campaign campaign) {
		this.campaign = campaign;
	}
	
	//join lead
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lead_id", referencedColumnName = "lead_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public lead getLead() {
		return lead;
	}

	public void setLead(lead lead) {
		this.lead = lead;
	}

	//join contact
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_id", referencedColumnName = "contact_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public contact getContact() {
		return contact;
	}

	public void setContact(contact contact) {
		this.contact = contact;
	}

	@Column(name = "contact_id", nullable = true)
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}


	@Column(name = "lead_id", nullable = true)
	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	

	@Column(name = "campaign_id", nullable = true)
	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCampaignmember_id() {
		return campaignmember_id;
	}

	public void setCampaignmember_id(int id) {
		this.campaignmember_id = id;
	}

}

