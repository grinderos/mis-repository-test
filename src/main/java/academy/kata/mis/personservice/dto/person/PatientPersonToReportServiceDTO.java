package academy.kata.mis.personservice.dto.person;

import academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO;
import academy.kata.mis.personservice.enums.IdentityDocumentType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.Set;

@Builder
public record PatientPersonToReportServiceDTO(Long personId,
                                              String firstName,
                                              String lastName,
                                              String patronymic,
                                              LocalDate birthday,
                                              IdentityDocumentType documentType,
                                              String documentNumber,
                                              Set<ContactToReportServiceDTO> contacts) {
}
