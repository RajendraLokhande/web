package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.TicketDto;

public interface TicketService {
	
	public TicketDto addTicket(TicketDto Dto );
	public TicketDto getTicket(Integer Id );
	public List<TicketDto> getAllTicket();
	public TicketDto updateTicket(TicketDto Dto,Integer Id );
	public TicketDto deleteTicket(Integer Id);

	public List<TicketDto> getTicketDetailsByEmail(String userEmail);
	
	

}
  