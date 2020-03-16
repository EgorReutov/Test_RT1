package ru.rostelecom.service.layers;

import ru.rostelecom.model.Tsveta;

import java.util.List;

/**
 * @author Egor Reutov
 * @since 0.1
 */
public interface TsvetaService {

    /**
     * Gets all colors.
     *
     * @return - List<Tsveta>
     */
    List<Tsveta> getAll();
}
