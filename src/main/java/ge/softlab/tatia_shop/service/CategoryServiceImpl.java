package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.repository.jpa.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository CategoryRepository;
}
