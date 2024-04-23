package com.dps.qlarius.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.qlarius.dao.PaymentCardDao;
import com.dps.qlarius.dao.UserDao;
import com.dps.qlarius.domain.PaymentCard;
import com.dps.qlarius.domain.User;
import com.dps.qlarius.service.PaymentCardService;

/**
 * PaymentCard Service
 * @author Dan Developer 
 */
@Service("paymentCardService")
public class PaymentCardServiceImpl implements PaymentCardService {

	private List<String> cardTypes =
		Arrays.asList("Visa", "Mastercard", "Visa Debit",
			"ApplePay", "American Express", "Diners Card");

	@Autowired
	private PaymentCardDao paymentCardDao;
	
	@Autowired
	private UserDao userDao;

	public void setPaymentCardDao(PaymentCardDao paymentCardDao) 
	{
		this.paymentCardDao = paymentCardDao;
	}
	
	public void setUserDao(UserDao userDao) 
	{
		this.userDao = userDao;
	}

	public List<PaymentCard> findPaymentCards(String username) {
		return paymentCardDao.findByUsername(username);
	}

	public PaymentCard findPaymentCardById(Long id) {
		return paymentCardDao.find(id);
	}

	public void capture(Long id) {
		// log the details of the transaction
	}

	public void addPaymentCard(PaymentCard paymentCard, String username) {
		User user = userDao.find(username);
		paymentCard.setUser(user);
		if (paymentCard.isPreferred()) {
			paymentCardDao.clearUsersPreferred(paymentCard.getUser().getUsername());
		} 
		paymentCardDao.persist(paymentCard);
	}
	
	public void updatePaymentCard(PaymentCard paymentCard) {
		if (paymentCard.isPreferred()) {
			paymentCardDao.setUsersPreferred(paymentCard.getUser().getUsername(), paymentCard);
		} else {
			paymentCardDao.merge(paymentCard);
		}
	}
		
	public void deletePaymentCard(PaymentCard paymentCard) {
		paymentCardDao.remove(paymentCard);
	}
	
	public void deletePaymentCardById(Long id) {
		PaymentCard paymentCard = paymentCardDao.find(id);
		paymentCardDao.remove(paymentCard);
	}
	
	public void setPreferredPaymentCard(String username, PaymentCard paymentCard) {
		paymentCardDao.setUsersPreferred(username, paymentCard);
	}

	public int charge(int amount) {
		int total = amount;
		total=(int)(amount*1.14);
		return total;
	}
	
	public List<String> getTypes() {
		// TODO: get from database
		return cardTypes;
	}

}