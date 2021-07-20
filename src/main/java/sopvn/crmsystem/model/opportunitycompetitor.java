package sopvn.crmsystem.model;

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
@Table(name = "opportunitycompetitor")
@EntityListeners(AuditingEntityListener.class)
public class opportunitycompetitor {
	private int opportunitycompetitor_id;
	private int competitorId;
	private int opportunityId;
	
	private opportunity opportunity;
	private competitor competitor;
	
	//join opportunity 
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "opportunity_id", referencedColumnName = "opportunity_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public opportunity getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(opportunity opportunity) {
		this.opportunity = opportunity;
	}

	//join competitor
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "competitor_id", referencedColumnName = "competitor_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public competitor getCompetitor() {
		return competitor;
	}

	public void setCompetitor(competitor competitor) {
		this.competitor = competitor;
	}

	@Column(name = "opportunity_id", nullable = true)
	public int getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(int opportunityId) {
		this.opportunityId = opportunityId;
	}


	
	@Column(name = "competitor_id", nullable = true)
	public int getCompetitorId() {
		return competitorId;
	}

	public void setCompetitorId(int id) {
		this.competitorId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getOpportunitycompetitor_id() {
		return opportunitycompetitor_id;
	}

	public void setOpportunitycompetitor_id(int opportunitycompetitor_id) {
		this.opportunitycompetitor_id = opportunitycompetitor_id;
	}

}

