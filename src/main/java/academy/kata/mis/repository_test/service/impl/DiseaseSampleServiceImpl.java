package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.repository.DiseaseSampleRepository;
import academy.kata.mis.repository_test.service.DiseaseSampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class DiseaseSampleServiceImpl implements DiseaseSampleService {

    private final DiseaseSampleRepository diseaseSampleRepository;

    @Override
    public Set<Long> getServiceDepIdByDoctorIdAndDiseaseDepId(long doctorId, long diseaseDepId) {
        return diseaseSampleRepository.getServiceDepIdByDoctorIdAndDiseaseDepId(doctorId, diseaseDepId);
    }

    @Override
    public Set<Long> getDiseaseSamplesIdByDoctorIdAndDiseaseId(long doctorId, long diseaseDepId) {
        return diseaseSampleRepository.getDiseaseSamplesIdByDoctorIdAndDiseaseId(doctorId, diseaseDepId);
    }

    @Override
    public Set<Long> getServiceDepIdByDiseaseSampleId(long diseaseSampleId) {
        return diseaseSampleRepository.getServiceDepIdByDiseaseSampleId(diseaseSampleId);
    }

}
