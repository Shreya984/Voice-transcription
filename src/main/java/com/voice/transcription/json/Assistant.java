package com.voice.transcription.json;
import java.util.List;
import java.util.Map;

public record Assistant(
        String id,
        String object,
        long createdAt,
        String name,
        String description,
        String model,
        String instructions,
        List<Tool> tools,
        List<String> fileIds,
        Map<String, Object> metadata
) {
}