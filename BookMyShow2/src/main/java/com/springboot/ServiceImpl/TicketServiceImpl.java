package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.MovieDto;
import com.springboot.Dto.TicketDto;
import com.springboot.Entity.Movie;
//import com.springboot.Entity.Movie;
import com.springboot.Entity.Ticket;
import com.springboot.Repository.TicketRepository;
import com.springboot.Service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public TicketDto addTicket(TicketDto Dto) {
		
	Ticket ticket =	this.modelMapper.map(Dto, Ticket.class);
	
	Ticket save = ticketRepository.save(ticket);
		return this.modelMapper.map(save, TicketDto.class);
	}

	@Override
	public TicketDto getTicket(Integer id) {
		Ticket ticket=ticketRepository.findById(id).orElse(null);
		return this.modelMapper.map(ticket, TicketDto.class);
			

	}

	@Override
	public List<TicketDto> getAllTicket() {
		List<Ticket>List= ticketRepository.findAll();
		List<TicketDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, TicketDto.class)).collect(Collectors.toList());
		
	    return List2;
	
	
	}

	@Override
	public TicketDto updateTicket(TicketDto Dto, Integer Id) {
		return null;
	}

	@Override
	public TicketDto deleteTicket(Integer Id) {
		return null;
	}

	@Override
	public List<TicketDto> getTicketDetailsByEmail(String userEmail) {

		List<Ticket> list = ticketRepository.findByUserEmail(userEmail);
		List<TicketDto> list2 = list.stream().map(list1->modelMapper.map(list1, TicketDto.class)).collect(Collectors.toList());
		
		
		return list2;
	}

	
	
	

}
