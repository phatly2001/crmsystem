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
@Table(name = "faq")
@EntityListeners(AuditingEntityListener.class)
public class faq {
	private int faq_id;
	private String faqQuestion;
	private String faqAnswer;
	

	@Column(name = "faq_answer", nullable = true)
	public String getFaqAnswer() {
		return faqAnswer;
	}

	public void setFaqAnswer(String faqAnswer) {
		this.faqAnswer = faqAnswer;
	}


	@Column(name = "faq_question", nullable = true)
	public String getFaqQuestion() {
		return faqQuestion;
	}

	public void setFaqQuestion(String faqQuestion) {
		this.faqQuestion = faqQuestion;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getFaq_id() {
		return faq_id;
	}

	public void setFaq_id(int id) {
		this.faq_id = id;
	}

}

