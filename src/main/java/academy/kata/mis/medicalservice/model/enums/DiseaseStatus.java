package academy.kata.mis.medicalservice.model.enums;

/**
 * статус - заведующий отделением может блокировать для врачей использование заболевания
 */
public enum DiseaseStatus {
    OPEN, //врачи отделения могут использовать в работе заболевание
    BLOCKED //врачи отделения не видят и не могут использовать в работе заболевание

}
