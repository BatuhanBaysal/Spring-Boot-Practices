package com.batuhan.gradesubmission;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.batuhan.gradesubmission.pojo.Grade;
import com.batuhan.gradesubmission.repository.GradeRepository;
import com.batuhan.gradesubmission.service.GradeService;

@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {
    
    @Mock
    private GradeRepository gradeRepository;

    @InjectMocks
    private GradeService gradeService;

    @Test
    public void getGradesFromRepoTest() {
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(
            new Grade("Batuhan", "Math", "C"),
            new Grade("Pinar", "Physics", "B+")
        ));

        List<Grade> result = gradeService.getGrades(); 
        assertEquals("Batuhan", result.get(0).getName());
        assertEquals("Math", result.get(0).getSubject());
    }

    @Test
    public void gradeIndexTest() {
        Grade grade = new Grade("Batuhan", "Math", "C");
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeRepository.getGrade(0)).thenReturn(grade);

        int valid = gradeService.getGradeIndex(grade.getId());
        int notFound = gradeService.getGradeIndex("123");

        assertEquals(0, valid);
        assertEquals(Constants.NOT_FOUND, notFound);
    }

    @Test
    public void returnGradeByIdTest() {
        Grade grade = new Grade("Batuhan", "Math", "C");
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeRepository.getGrade(0)).thenReturn(grade);

        String id = grade.getId();
        Grade result = gradeService.getGradeById(id);
        assertEquals(grade, result);
    }

    @Test
    public void addGradeTest() {
        Grade grade = new Grade("Batuhan", "Math", "C");
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeRepository.getGrade(0)).thenReturn(grade);

        Grade newGrade = new Grade("Pinar", "Physics", "B+");
        gradeService.submitGrade(newGrade);
        verify(gradeRepository, times(1)).addGrade(newGrade);
    }

    @Test
    public void updateGradeTest() {
        Grade grade = new Grade("Batuhan", "Math", "C");
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeRepository.getGrade(0)).thenReturn(grade);

        grade.setScore("B+");
        gradeService.submitGrade(grade);
        verify(gradeRepository, times(1)).updateGrade(grade, 0);
    }
}