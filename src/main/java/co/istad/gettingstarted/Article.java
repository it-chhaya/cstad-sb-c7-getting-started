package co.istad.gettingstarted;

import lombok.Builder;

@Builder
public record Article(String title,
                      String author,
                      String description) {
}
