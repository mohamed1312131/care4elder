package service;

import entity.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.IReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class ServiceImp implements IService{
    IReservationRepository reservationRepository;

    @Override
    public Reservation AjouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> getReservationById(String id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation updateReservation(String id, Reservation r) {
        return reservationRepository.findById(id)
                .map(existing -> {
                    existing.setDate(r.getDate());
                    existing.setHeure(r.getHeure());
                    existing.setStatut(r.getStatut());
                    return reservationRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }
}
